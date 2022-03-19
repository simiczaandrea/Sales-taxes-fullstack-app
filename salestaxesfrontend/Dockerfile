FROM node

WORKDIR /app
COPY package.json .
RUN npm install
RUN npm install source-map-resolve
RUN npm install -g npm@8.5.5
COPY . .
EXPOSE 3000

CMD ["npm", "start"]
