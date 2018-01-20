require 'sinatra'
require 'json'

# main class
class Server < Sinatra::Base
  get '/' do
    'Hello World!'
  end

  get '/wannatags' do
    wannatag = {
      wannatagId: 1111,
      title: 'sample1',
      body: 'this wannatag is sample1.',
      username: 'sample user A',
      postDate: 1_234_567_890_123,
      isOwner: true
    }

    # get url query param
    compare = params['compare']
    postDate = params['postDate']
    limit = params['limit']
    puts compare
    puts postDate
    puts limit

    wannatag.to_json
  end

  post '/wannatags' do
    # ここ、わからなかったです♡
  end

  delete '/wannatags/:postDate' do
    'deleted' + params[:postDate]
  end
end
